import React from "react";
import Input from "../components/Input";
import Select from "../components/Select";
import BodyForm from "../components/BodyForm";
import Button from "../components/Button";
import Componenten1 from "../components/Componente1"
import Componenten2 from "../components/Componente2"

function Form() {
  return (
    <BodyForm>
      <h1>Página de Formulário</h1>

      <Input placeholder="Nome" />
      <Select>
        <option value="Aluno">Aluno</option>
        <option value="Professor">Professor</option>
        <option value="Monitor">Monitor</option>
      </Select>

      <Button type="Button">Cadastrar</Button>
      <Componenten1></Componenten1>
    </BodyForm>
  );
}

export default Form;
