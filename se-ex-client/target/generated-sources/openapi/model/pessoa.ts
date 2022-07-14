/**
 * Serasa Experian
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { Score } from './score';
import { Afinidade } from './afinidade';


export interface Pessoa { 
    id?: number;
    dataInclusao?: string;
    nome?: string;
    telefone?: string;
    cidade?: string;
    estado?: Pessoa.EstadoEnum;
    regiao?: Afinidade;
    idade?: number;
    score?: Score;
}
export namespace Pessoa {
    export type EstadoEnum = 'AC' | 'AL' | 'AP' | 'AM' | 'BA' | 'CE' | 'DF' | 'ES' | 'GO' | 'MA' | 'MT' | 'MS' | 'MG' | 'PA' | 'PB' | 'PR' | 'PE' | 'PI' | 'RJ' | 'RN' | 'RS' | 'RO' | 'RR' | 'SC' | 'SP' | 'SE' | 'TO';
    export const EstadoEnum = {
        Ac: 'AC' as EstadoEnum,
        Al: 'AL' as EstadoEnum,
        Ap: 'AP' as EstadoEnum,
        Am: 'AM' as EstadoEnum,
        Ba: 'BA' as EstadoEnum,
        Ce: 'CE' as EstadoEnum,
        Df: 'DF' as EstadoEnum,
        Es: 'ES' as EstadoEnum,
        Go: 'GO' as EstadoEnum,
        Ma: 'MA' as EstadoEnum,
        Mt: 'MT' as EstadoEnum,
        Ms: 'MS' as EstadoEnum,
        Mg: 'MG' as EstadoEnum,
        Pa: 'PA' as EstadoEnum,
        Pb: 'PB' as EstadoEnum,
        Pr: 'PR' as EstadoEnum,
        Pe: 'PE' as EstadoEnum,
        Pi: 'PI' as EstadoEnum,
        Rj: 'RJ' as EstadoEnum,
        Rn: 'RN' as EstadoEnum,
        Rs: 'RS' as EstadoEnum,
        Ro: 'RO' as EstadoEnum,
        Rr: 'RR' as EstadoEnum,
        Sc: 'SC' as EstadoEnum,
        Sp: 'SP' as EstadoEnum,
        Se: 'SE' as EstadoEnum,
        To: 'TO' as EstadoEnum
    };
}

