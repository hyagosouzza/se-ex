import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PessoaVisualizationComponent } from './pessoa-visualization.component';

describe('PessoaEditComponent', () => {
  let component: PessoaVisualizationComponent;
  let fixture: ComponentFixture<PessoaVisualizationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PessoaVisualizationComponent]
    })
      .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PessoaVisualizationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
