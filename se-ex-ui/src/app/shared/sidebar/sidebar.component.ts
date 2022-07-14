import { Component, OnInit } from '@angular/core';

interface Option {
  url: string;
  name: string;
  icon: string;
}

const ROUT_PREFIX = '/admin/';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent implements OnInit {

  readonly options: Option[] = [
    { name: 'Pessoas', url: ROUT_PREFIX + 'pessoas', icon: 'face' },
    { name: 'Scores', url: ROUT_PREFIX + 'scores', icon: 'sports_score' },
    { name: 'Afinidades', url: ROUT_PREFIX + 'afinidades/cadastro', icon: 'explore' }
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
