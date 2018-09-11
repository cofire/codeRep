import { AngularDemo02Page } from './app.po';

describe('angular-demo02 App', () => {
  let page: AngularDemo02Page;

  beforeEach(() => {
    page = new AngularDemo02Page();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
