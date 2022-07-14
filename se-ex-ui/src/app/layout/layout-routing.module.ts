import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PessoaCreateComponent } from "./pessoa/pessoa-create/pessoa-create.component";
import { PessoaComponent } from "./pessoa/pessoa.component";
import { LayoutComponent } from "./layout.component";
import { ScoreComponent } from "./score/score.component";
import { AfinidadeComponent } from "./afinidade/afinidade.component";
import { PessoaVisualizationComponent } from "./pessoa/pessoa-visualization/pessoa-visualization.component";

const routes: Routes = [
  {
    path: '',
    component: LayoutComponent,
    children: [
      {
        path: 'pessoas',
        component: PessoaComponent,
      },
      {
        path: 'pessoas/cadastro',
        component: PessoaCreateComponent
      },
      {
        path: 'pessoas/:id',
        component: PessoaVisualizationComponent
      },
      {
        path: 'scores',
        component: ScoreComponent
      },
      {
        path: 'afinidades/cadastro',
        component: AfinidadeComponent
      },
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LayoutRoutingModule {}
