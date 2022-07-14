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


export interface Afinidade { 
    regiao?: string;
    estados?: Array<Afinidade.EstadosEnum>;
}
export namespace Afinidade {
    export type EstadosEnum = 'AC' | 'AL' | 'AP' | 'AM' | 'BA' | 'CE' | 'DF' | 'ES' | 'GO' | 'MA' | 'MT' | 'MS' | 'MG' | 'PA' | 'PB' | 'PR' | 'PE' | 'PI' | 'RJ' | 'RN' | 'RS' | 'RO' | 'RR' | 'SC' | 'SP' | 'SE' | 'TO';
    export const EstadosEnum = {
        Ac: 'AC' as EstadosEnum,
        Al: 'AL' as EstadosEnum,
        Ap: 'AP' as EstadosEnum,
        Am: 'AM' as EstadosEnum,
        Ba: 'BA' as EstadosEnum,
        Ce: 'CE' as EstadosEnum,
        Df: 'DF' as EstadosEnum,
        Es: 'ES' as EstadosEnum,
        Go: 'GO' as EstadosEnum,
        Ma: 'MA' as EstadosEnum,
        Mt: 'MT' as EstadosEnum,
        Ms: 'MS' as EstadosEnum,
        Mg: 'MG' as EstadosEnum,
        Pa: 'PA' as EstadosEnum,
        Pb: 'PB' as EstadosEnum,
        Pr: 'PR' as EstadosEnum,
        Pe: 'PE' as EstadosEnum,
        Pi: 'PI' as EstadosEnum,
        Rj: 'RJ' as EstadosEnum,
        Rn: 'RN' as EstadosEnum,
        Rs: 'RS' as EstadosEnum,
        Ro: 'RO' as EstadosEnum,
        Rr: 'RR' as EstadosEnum,
        Sc: 'SC' as EstadosEnum,
        Sp: 'SP' as EstadosEnum,
        Se: 'SE' as EstadosEnum,
        To: 'TO' as EstadosEnum
    };
}

