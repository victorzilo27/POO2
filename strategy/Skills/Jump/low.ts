import { Jump } from ".";

export class LowJump implements Jump{
    public jump(): void{
        console.log("Low Jump");
    }
}