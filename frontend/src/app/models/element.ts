export class Element {
    constructor (
        public id: number,
        public name: string,
        public price: DoubleRange,
        public quantity: number
    ) {}
}