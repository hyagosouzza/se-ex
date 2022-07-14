import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PessoaCreateComponent } from './pessoa-create.component';

describe('PessoaEditComponent', () => {
  let component: PessoaCreateComponent;
  let fixture: ComponentFixture<PessoaCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PessoaCreateComponent]
    })
      .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PessoaCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
