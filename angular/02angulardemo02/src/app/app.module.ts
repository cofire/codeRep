import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';


import { NgZorroAntdModule } from 'ng-zorro-antd';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


import { AppComponent } from './app.component';
import { ShopComponent } from './shop/shop.component';
import { ProductComponent } from './product/product.component';
import { UserComponent } from './user/user.component';
import { HomeComponent } from './home/home.component';

import { UserlistComponent } from './user/userlist/userlist.component';
import { VipComponent } from './user/vip/vip.component';
import { AdduserComponent } from './user/adduser/adduser.component';
import { EidtuserComponent } from './user/eidtuser/eidtuser.component';

//双休数据绑定
import { FormsModule ,ReactiveFormsModule} from '@angular/forms';

//请求数据
import { HttpModule } from '@angular/http';
import { EditmodalComponent } from './user/userlist/editmodal/editmodal.component';

import { CUSTOM_ELEMENTS_SCHEMA ,NO_ERRORS_SCHEMA}  ;
import { NameComponent } from './name/name.component'from '@angular/core';

@NgModule({
  declarations: [
    AppComponent,
    ShopComponent,
    ProductComponent,
    UserComponent,
    HomeComponent,
    UserlistComponent,
    VipComponent,
    AdduserComponent,
    EidtuserComponent,
  ,
    NameComponent  EditmodalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule, 
    FormsModule,
    HttpModule,
    NgZorroAntdModule.forRoot(),
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA ]
})
export class AppModule { }
