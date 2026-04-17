import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeTitle } from './home-title';

describe('HomeTitle', () => {
  let component: HomeTitle;
  let fixture: ComponentFixture<HomeTitle>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HomeTitle],
    }).compileComponents();

    fixture = TestBed.createComponent(HomeTitle);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
