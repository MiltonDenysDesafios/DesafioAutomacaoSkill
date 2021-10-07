#Author: milton.silva17@fatec.sp.gov.br
@skill
Feature: Cadastro Aluno Skill
  Template para scenario outline 

  @cadastroAluno
  Scenario: Cadastrar um aluno no site da skill
    Given eu acesso a pagina principal
    |nome	|email						|cel				|end				|estado		|cidade		|escola			|
    |joao	|teste@hotmail.com|11983845544|Rua Augusta|Sao Paulo|Sao Paulo|Casa Verde	|
    When preencho os campos necessarios para fazer matricula 
    #And clico no botao "EU QUERO"
    #And preencho a data e horario corretos
    #Then valido se o agendamento foi feito com sucesso "<produtoRetornado>" 
    
  
   
    

