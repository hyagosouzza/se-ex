export * from './afinidade.service';
import { AfinidadeService } from './afinidade.service';
export * from './pessoa.service';
import { PessoaService } from './pessoa.service';
export * from './score.service';
import { ScoreService } from './score.service';
export const APIS = [AfinidadeService, PessoaService, ScoreService];
