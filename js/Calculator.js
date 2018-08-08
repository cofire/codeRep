//四舍五入到两位小数
function MyRound(a_Num)
{
    return (Math.round(a_Num*100)/100);
}

function MyRound2(num)
{
    if (num < 0)
        return "0.00";
        
    var numstr = num.toString();
    var point = numstr.indexOf(".");    
    
    if (point < 0)
    {
        return numstr+".00";
    }
    else if (point == 0)
    {
        return "0"+numstr;
    }
    else if (point == numstr.length-1)
    {
        return numstr+"00";
    }
    else if (point == (numstr.length-2))
    {
        return numstr+"0";
    }
    else
    {
        var intstr = numstr.substr(0,point);
        var floatstr = numstr.substr(point+1,numstr.length - point -1);
        
        if(floatstr.length==1)
            return numstr+"0";
        else 
        {
            var innum = 0;
            
            for(i=floatstr.length-1;i>1;i--)
            {
                if ((parseInt(floatstr.charAt(i))+innum)>=5)
                {
                    innum = 1;
                }   
                else
                {
                    innum = 0
                }
            }
            
            var float2 = parseInt(floatstr.substr(0,2))+innum;
            
            if (float2 <10)
                return intstr+".0"+float2;
            else if (float2 <100)
                return intstr+"."+float2;
            else
                return (parseInt(intstr)+1).toString()+"."+float2.toString().substr(1,2);
        }
    }
}


//递增还款的月还款额(参数: 年利率 / 贷款总额 / 贷款总月份 / 贷款当前月0～length-1)
function GetMonthPay3(total,rate,termnum,currindex,begininc,incmoney,incsp)
{
    if (currindex > termnum)
        return 0;
    
    var we = (termnum - (begininc-1))%incsp;
    var v = parseInt((termnum - (begininc-1))/incsp);
    var monthrate = rate / 1200;    
    
    var tmp1 = (total * monthrate * (Math.pow(1 + monthrate, termnum)))/(Math.pow(1 + monthrate, termnum)-1);
    var tmp2 = incmoney /(Math.pow(1 + monthrate, termnum)-1);
    var tmp3 = Math.pow(1 + monthrate, we) * (Math.pow(1 + monthrate, (v+1)*incsp )-1) / (Math.pow(1 + monthrate, incsp)-1);
    
    var A = tmp1 - tmp2 * (tmp3 - (v+1));
    
    if (currindex < begininc)
    {
        return A;
    }
    else
    {
        var t = parseInt((currindex-begininc)/incsp)+1;
        
        return A + t*incmoney;
    }
}

function GetMaxIncmoney(total,rate,termnum,begininc,incmoney,incsp,gt)
{
    var we = (termnum - (begininc-1))%incsp;
    var v = parseInt((termnum - (begininc-1))/incsp);
    var monthrate = rate / 1200;    
        
    if (gt >0)
    {
        return total * monthrate /( Math.pow(1 + monthrate, we) * (Math.pow(1 + monthrate, (v+1)*incsp )-1) / (Math.pow(1 + monthrate, incsp)-1) - (v+1));
    }
    else
    {
        var tmp1 = (total * monthrate * (Math.pow(1 + monthrate, termnum)))/(Math.pow(1 + monthrate, termnum)-1);
        var tmp2 = 1 /(Math.pow(1 + monthrate, termnum)-1);
        var tmp3 = Math.pow(1 + monthrate, we) * (Math.pow(1 + monthrate, (v+1)*incsp )-1) / (Math.pow(1 + monthrate, incsp)-1);
        
        return tmp1/((v+1) - tmp2*(tmp3 - (v+1)));
    }   
}

function GetMonthCapital(remain,monthpay,rate)
{
    var monthrate = rate / 1200;
    
    return monthpay - MyRound(remain*monthrate);
}


//递增还款的月还款额(参数: 年利率 / 贷款总额 / 贷款总月份 / 贷款当前月0～length-1)
function GetMonthPay4(total,rate,termnum,currindex,begininc,incmoney,incsp)
{
    if (currindex >= termnum)
        return 0;
    
    var we = (termnum - (begininc-1))%incsp;
    var v = parseInt((termnum - (begininc-1))/incsp);
    var monthrate = rate / 1200;    
    
    var tmp1 = (total * monthrate * (Math.pow(1 + monthrate, termnum)))/(Math.pow(1 + monthrate, termnum)-1);
    var tmp2 = incmoney /(Math.pow(1 + monthrate, termnum)-1);
    var tmp3 = Math.pow(1 + monthrate, we) * (Math.pow(1 + monthrate, (v+1)*incsp )-1) / (Math.pow(1 + monthrate, incsp)-1);
    
    var A = tmp1 - tmp2 * (tmp3 - (v+1));   
    
    if (currindex < begininc)
    {
        return A;
    }
    else
    {
        var t = parseInt((currindex-begininc)/incsp)+1;
        
        return A + t*incmoney;
    }
}


//本金还款的月还款额(参数: 年利率 / 贷款总额 / 贷款总月份 / 贷款当前月0～length-1)
function GetMonthPay2(total,rate,termnum,monthindex)
{
    if (monthindex >= termnum)
        return 0;
        
    var monthrate = rate / 1200;//月利率   
    var monthtotal = MyRound(total/termnum);
    return (total - monthtotal * monthindex) * monthrate + monthtotal;
}

function GetLastMonthPay2(total,rate,termnum)
{
    var monthrate = rate / 1200;//月利率   
    var monthtotal = MyRound(total/termnum);
    return (total - monthtotal*(termnum-1))*(1+monthrate);
}


//本息还款的月还款额(参数: 年利率/贷款总额/贷款总月份)
function GetMonthPay1(total,rate,termnum)
{
    var monthrate = rate / 1200;//月利率
    return total * monthrate * Math.pow(1 + monthrate, termnum) / ( Math.pow(1 + monthrate, termnum) -1 );
}

function GetLastMonthPay(total,rate,termnum,monthpay)
{
    var monthrate= rate /1200;
    var tmp = 0.0;
    
    for(i=1;i<termnum;i++)
    {
        tmp += Math.pow(1 + monthrate,i);
    }
    
    //alert(monthpay * tmp);
    
    return total * Math.pow( 1 + monthrate,termnum) - monthpay * tmp;
}

function GetLastMonthPay1(total,rate,termnum,monthpay)
{
    var monthrate= rate /1200; //parseFloat(MyRound(rate /12))/100;
    
    var remain = total; 
    
    //alert(1+monthrate);
    
    for(index=1;index<termnum;index++)
    {
        remain = parseFloat(MyRound(remain*(1+monthrate))-monthpay);
    }
    
    return remain*(1+monthrate);
}

function GetPriceByMonth(monthpay,rate,termnum,area,firstpay)
{
    var monthrate = rate / 1200;
    var month = 7*firstpay*monthrate * Math.pow(1 + monthrate, termnum)/(3*( Math.pow(1 + monthrate, termnum) -1)); 
    
    if (month > monthpay)
    {
        month = monthpay;
    }   
    
    var total = month * ( Math.pow(1 + monthrate, termnum) -1 )/(monthrate * Math.pow(1 + monthrate, termnum)) +firstpay;
    var price  = total/area;
        
    var result = new Array(3);
    result[0] = MyRound(total); 
    result[1] = MyRound(price);
    result[2] = MyRound(month);
    
    return result;
}

function GetTax(area,price)
{   
    var total = area*price;
    var yhs = total*0.0005;
    var gzf = total*0.003;
    var qs = 0;
    var cqsxf = gzf;
    var mmsxf = 0;  
    
    if (price<=9432) 
        qs=total*0.015
    else 
        qs=total*0.03
    
    if (area<=120)  
        mmsxf=500;
    else if (area>5000)  
        mmsxf=5000;
    else  
        mmsxf=1500;
    
    var result = new Array(7);
    result[0] = MyRound(yhs);   
    result[1] = MyRound(total);
    result[2] = MyRound(qs);
    result[3] = MyRound(gzf);
    result[4] = MyRound(gzf);
    result[5] = MyRound(mmsxf);
    result[6] = MyRound(yhs+gzf+qs+cqsxf+mmsxf);
        
    return result;  
}

//获取贷款利息
function GetYearRate(type,years)
{
    if (years<=5)
    {
        switch(type)
        {
            case 1:return 4.77;
            case 2:return 3.78;
            case 3:return 3.60;
            default:return 4.95;
        }
    }
    else
    {
        switch(type)
        {
            case 1:return 5.04;
            case 2:return 4.23;
            case 3:return 4.05;
            default:return 5.31;
        }
    }   
}

function GetHadPay(total,yearrate,termnum,repaytype,repayadvance,termindex,opertype)
{
    var repayadvance = parseFloat(repayadvance);
    var total = parseFloat(total);
    var rate = yearrate/1200;
    var hadterms = termindex - 1;
    var omonthpay = GetMonthPay1(total,yearrate,termnum);
    var hadpaytotal = hadterms*omonthpay;
    var hadrate = 0;
    var hadben = 0;
    var currmonthpay = 0;
    var nmonthepay = 0;
    var saverate = 0;
    var remainterms = 0;
    var oremain = termnum-termindex;
    
    for(j=1;j<=hadterms;j++)
    {
        hadrate = hadrate+(total-hadben)*rate;
        hadben = hadben+omonthpay-(total-hadben)*rate;
    }
    
    var remark = '';
    if (repaytype == 1)
    {       
        if((repayadvance+omonthpay) >= ((total-hadben)*(1+rate)))
        {
            remark = '您的提前还款额已足够还清所欠贷款！';
        }
        else
        {
            hadben = hadben+omonthpay;
            currmonthpay = omonthpay+repayadvance;
            
            if(opertype == 0)
            {
                var temp = hadben+repayadvance;
                
                for(k=0;temp<=total;k++) 
                {
                    temp = temp+omonthpay-(total-temp)*rate;
                }
                k=k-1;
                nmonthepay = (total-hadben-repayadvance)*(rate*Math.pow((1+rate),k))/(Math.pow((1+rate),k)-1);
                saverate = omonthpay*termnum-hadpaytotal-currmonthpay-nmonthepay*k;
                remainterms = k-1;
            }
            else
            {
                nmonthepay = (total-hadben-repayadvance)*(rate*Math.pow((1+rate),(termnum-hadterms)))/(Math.pow((1+rate),(termnum-hadterms))-1);
                saverate = omonthpay*termnum-hadpaytotal-currmonthpay-nmonthepay*(termnum-hadterms);
                remainterms = oremain;
            }
        }
    }
    else
    {
        currmonthpay = (total-hadben)*(1+rate);
        nmonthepay = 0;
        saverate = omonthpay*termnum-hadpaytotal-currmonthpay;
        remainterms = 0;
    }   
    
    var result = new Array(9);
    result[0] = remark; 
    result[1] = MyRound(hadpaytotal);
    result[2] = MyRound(hadrate);
    result[3] = MyRound(omonthpay);
    result[4] = oremain;    
    result[5] = MyRound(nmonthepay);
    result[6] = remainterms;
    result[7] = MyRound(currmonthpay);
    result[8] = MyRound(saverate);
        
    return result;  
}

//获取参数
function getQuery(name)
{
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r!=null) 
    {
        return unescape(r[2]); 
    }
    return null;
}

        function createTable(sbResult)
        {
            sbResult="<table cellpadding=3 style='BORDER-COLLAPSE: collapse' align=center borderColor=#c6c9ce cellSpacing=0 rules=all width=546 border=1>";
            sbResult+="<tr height=24><td width=20% bgcolor=#dbdbdb align=center>期数</td><td width=20% bgcolor=#dbdbdb align=center>月供</td><td width=20% bgcolor=#dbdbdb align=center>月供本金</td><td width=20% bgcolor=#dbdbdb align=center>月供利息</td><td width=20% bgcolor=#dbdbdb align=center>本金余额</td></tr>";        
            return sbResult;
        }

        function endTable(sbResult)
        {
            sbResult+="</table>";
            return sbResult;
        }
            
        function formatnumber(num)
        {
            var dotIndex=num.indexOf(".");
            var length=num.length;
            if(dotIndex==length-2)
                {num=num+"0";}
            switch(dotIndex){
            case -1:num=num+".00";break;
        //  case 2:num=num+"0";break;
            default:break;}
        /*  var length=num.length;
            if(dotIndex==-1)
                {num=num+".00";
                return num;
                }
            if(dotIndex==length-1)
                {num+"0";return num;}*/
            return num;
        }

function GetDaysBetween(sy,sm,sd,ey,em,ed)
{   
    if ((sy>ey)||((sy==ey)&&(sm>em))||((sy==ey)&&(sm==em)&&(sd>ed)))
    {       
        return -1;
    }
    
    var res = 0;
    
    if (sy==ey)
    {
        if (sm == em)
        {
            res += ed -sd;
        }
        else
        {           
            for (i=sm+1;i<em;i++)
            {
                res += GetMonthDays(sy,i);              
            }
            
            res += GetMonthDays(sy,sm)-sd;
            res += ed;
        }
    }
    else
    {
        for (i=sy+1;i<ey;i++)
        {
            res += GetYearDays(i);
        }
        
        for (j=sm+1;j<13;j++)
        {
            res += GetMonthDays(sy,j);
        }
        
        for (k=1;k<em;k++)
        {
            res += GetMonthDays(ey,k);
        }
        
        res += GetMonthDays(sy,sm)-sd;
        res += ed;
    }   
    
    return res;
}

function GetMonthDays(y,m)
{
    if (m == 2)
    {
        if ((y%4 == 0)||((y%100 == 0)&&(y%400 == 0)))
        {
            return 29;
        }
        else
        {
            return 28;
        }
    }
    else
    {   
        if ((m == 4)||(m == 6)||(m == 9)||(m == 11))
        {
            return 30;
        }
        else
        {
            return 31;
        }
    }
}

function GetYearDays(y)
{
    if ((y%4 == 0)||((y%100 == 0)&&(y%400 == 0)))
    {
        return 366;
    }
    else
    {
        return 365;
    }
}

        function byselected(ctlname,argvalue)
        {
            for(i=0;i<ctlname.length;i++)
            {
                if(ctlname[i].value == argvalue)
                {
                    ctlname[i].selected = true;
                }
            }
        }
        
        function GetEndDate(sy,sm,sd,termcount)
{
    var ey,em,ed,tmp;
    
    ed = sd;
    
    if ((termcount+sm) <=12)
    {
        ey = sy;
        em = sm;
        
        if ((em == 2)&&(ed >= 29))
        {
            if (sy%4 == 0)
            {
                ed = 29;
            }
            else
            {
                ed =28;
            }
        }
        else if (ed == 31) 
        {
            if ((em==4)||(em==6)||(em==9)||(em==11))
            {
                ed =30;
            }
        }
        
        return sy+"-"+(termcount+sm)+"-"+ed;
    }
    else
    {
        tmp = termcount + sm;
        
        if (tmp%12 >0)
        {
            ey = sy + parseInt(tmp/12);
            em = tmp%12;
        }
        else
        {
            ey = sy + parseInt(tmp/12);
            em = 12;
        }
        
        if ((em == 2)&&(ed >= 29))
        {
            if (sy%4 == 0)
            {
                ed = 29;
            }
            else
            {
                ed =28;
            }
        }
        else if (ed == 31) 
        {
            if ((em==4)||(em==6)||(em==9)||(em==11))
            {
                ed =30;
            }
        }   
        
        return ey+"-"+em+"-"+sd; 
    }
}       
        