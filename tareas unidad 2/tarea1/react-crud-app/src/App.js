import logo from './logo.svg';
import './App.css';
import { Component } from 'react';
import { PersonaService } from './service/PersonaService';
import {DataTable} from 'primereact/datatable';
import {Column} from 'primereact/column';
import { Menubar } from 'primereact/menubar';
import { Dialog } from 'primereact/dialog';
import { InputText } from 'primereact/inputtext';
        


import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';

export default class App extends Component{
  constructor(){
    super();
    this.state = {};
    this.items = [
      {
        label : 'New',
        icon : 'pi pi-fw pi-plus',
        command : ()=>{this.showsaveDialogo()}
      },
      {
        label : 'Editar',
        icon : 'pi pi-fw pi-pencil',
        command : ()=>{this.showsaveDialogo()}
      },
      {
        label : 'Eliminar',
        icon : 'pi pi-fw pi-trash',
        command : ()=>{alert('Saved!')}
      },
    ];
    this.ps = new PersonaService();
  }

  componentDidMount(){
    this.ps.getAll().then(data => this.setState({productos: data}))
    this.setState({
      visible : false,
      producto: {
        productoId: null,
        productoNombre: null
      },
      value: ''
    });
  }
  render(){
    return(
      <div>
        <Menubar model={this.items}/>
        <DataTable value={this.state.productos}>
          <Column field="productoId" header="ID"></Column>
          <Column field="productoNombre" header="Nombre"></Column>
        </DataTable>
        <Dialog header="nombre del producto" visible={this.state.visible} style={{ width: '60%' }} model={true} onHide={() => this.setVisible({visible: false})}>
            <span className="p-float-label">
              <InputText value={this.state.value} onChange={(e) => this.setState(prevState =>
                 { 
                  let producto = Object.assign({}, prevState.producto)
                  producto.productoNombre = e.target.value
                  return {producto};
                 })} />
                  <label htmlFor="productoNombre">Nombre</label>
            </span>
        </Dialog>
      </div>
      
    );
  }
  showsaveDialogo(){
    this.setState({
      visible : true
    });
  }

}
