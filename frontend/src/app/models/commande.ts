import { Element } from "./element";

export class Commande {
    constructor (
        public id: number,
        public status: string,
        public elements: Element[]
    ) {}
}