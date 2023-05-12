import axios from "axios";

export class PersonaService{
    baseUrl = "http://localhost:8080/producto";
    getAll(){
        return axios.get(this.baseUrl).then(res => res.data);
    }
}
//res.data