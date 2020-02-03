import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MatriculaOnlineComponent } from './matricula-online/matricula-online.component';
import { MatricularComponent } from './matricula-online/matricular/matricular.component';

const routes: Routes = [
  {
    path: 'matriculaOnline/matricular',
    component: MatricularComponent,
  },
  {
    path: 'matriculaOnline',
    component: MatriculaOnlineComponent,
  },
  {
    path: '**',
    redirectTo: 'matriculaOnline'
  },

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PeriodoAcademicoRoutingModule { }