import { Categoria } from "./categorias";

export type Despesa = {
    id: 11,
    ultima_fatura: number,
    media_fatura: number,
    total: number,
    date: string,
    categoria: Categoria
};

export type DespesaPage = {
    content?: Despesa[],
    last: boolean,
    totalPages: number,
    totalElements: number,
    first: boolean,
    numberOfElements?: number,
    size?: number,
    number: number,
    empty?: boolean
};

export type DespesaSum = {
    categoriaNome: string;
    soma: number;
}
    
export type despesaSucesso = {
    
    categoriaNome: string;
    ultima_fatura: number;
    media_fatura: number;
    
};