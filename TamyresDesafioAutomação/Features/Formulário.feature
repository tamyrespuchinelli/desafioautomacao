# language: pt
Funcionalidade: Preencher Formulário

  Cenário:  Preencher campos obrigatorios
    Dado Acesso a url https://docs.google.com/forms/d/e/1FAIpQLSfWfPcADbvEPrGDePWhY-agioR1TAyFZTW-hwNTucN28-VACg/viewform
    Quando  Preencho meu nome Tamyres Lisboa
    E Preencho meu email  teste@teste.com
    E Prencho minha cor favorita
    E Preencho minha sobremesa favorita
    E Preencho minha comida favorita
    E Respondo o quanto gosto de animais
    E Respondo o quanto considero o eSport
    E Respondo o quanto considero o Baseball
    E Respondo o quanto considero o Futebol
    E Respondo o quanto considero o Rugby
    E Preencho os ingredientes Pão Carne Queijo Ovo Salada do sandwich EggXburguer
    E Preencho os ingredientes Pão Queijo Ovo Salada do sandwich Vegetariano
    E Preencho os ingredientes Pão Carne Queijo Salada do sandwich Xburguer
    E Preencho os ingredientes Pão Carne do sandwich Hamburguer
    E Respondo que o dia hoje é
    E Prencho a hora
    E Clico em enviar
    Então Verifico a mensagem Sua resposta foi registrada.


#  Cenário: :  Validar nome completo
#    Dado Acesso a url https://docs.google.com/forms/d/e/1FAIpQLSfWfPcADbvEPrGDePWhY-agioR1TAyFZTW-hwNTucN28-VACg/viewform
#    Quando  Preencho meu nome Tamyres
#    Então  Verifico a mensagem Preencha o sobrenome
#
#
#  Cenário: :  Validar email incorreto
#    Dado Acesso a url https://docs.google.com/forms/d/e/1FAIpQLSfWfPcADbvEPrGDePWhY-agioR1TAyFZTW-hwNTucN28-VACg/viewform
#    Quando  Preencho meu nome Tamyres Lisboa
#    E Preencho meu email  teste.com
#    Então  Verifico a mensagem Esse e-mail não parece válido
#
#
#  Cenário:  Preencher mais de uma sobremesa favorita
#    Dado Acesso a url https://docs.google.com/forms/d/e/1FAIpQLSfWfPcADbvEPrGDePWhY-agioR1TAyFZTW-hwNTucN28-VACg/viewform
#    Quando  Preencho meu nome Tamyres Lisboa
#    E Preencho meu email  teste@teste.com
#    E Prencho minha cor favorita
#    E Preencho minha sobremesa favorita
#    E Preencho minha comida favorita
#    E Respondo o quanto gosto de animais
#    E Respondo o quanto considero o eSport
#    E Respondo o quanto considero o Baseball
#    E Respondo o quanto considero o Futebol
#    E Respondo o quanto considero o Rugby
#    E Preencho os ingredientes Pão Carne Queijo Ovo Salada do sandwich EggXburguer
#    E Preencho os ingredientes Pão Queijo Ovo Salada do sandwich Vegetariano
#    E Preencho os ingredientes Pão Carne Queijo Salada do sandwich Xburguer
#    E Preencho os ingredientes Pão Carne do sandwich Hamburguer
#    E Respondo que o dia hoje é
#    E Prencho a hora
#    E Clico em enviar
#    Então Verifico a mensagem Sua resposta foi registrada.


#  Cenário: Preencher data inválida
#    Dado Acesso a url https://docs.google.com/forms/d/e/1FAIpQLSfWfPcADbvEPrGDePWhY-agioR1TAyFZTW-hwNTucN28-VACg/viewform
#    Quando  Preencho meu nome Tamyres Lisboa
#    E Preencho meu email  teste@teste.com
#    E Prencho minha cor favorita
#    E Preencho minha sobremesa favorita
#    E Preencho minha comida favorita
#    E Respondo o quanto gosto de animais
#    E Respondo o quanto considero o eSport
#    E Respondo o quanto considero o Baseball
#    E Respondo o quanto considero o Futebol
#    E Respondo o quanto considero o Rugby
#    E Preencho os ingredientes Pão Carne Queijo Ovo Salada do sandwich EggXburguer
#    E Preencho os ingredientes Pão Queijo Ovo Salada do sandwich Vegetariano
#    E Preencho os ingredientes Pão Carne Queijo Salada do sandwich Xburguer
#    E Preencho os ingredientes Pão Carne do sandwich Hamburguer
#    E Preencho uma data inválida 29022021
#    E Prencho a hora
#    E Clico em enviar
#    Então Verifico a mensagem Data inválida
#
#
#  Cenário: Preencher hora inválida
#    Dado Acesso a url https://docs.google.com/forms/d/e/1FAIpQLSfWfPcADbvEPrGDePWhY-agioR1TAyFZTW-hwNTucN28-VACg/viewform
#    Quando  Preencho meu nome Tamyres Lisboa
#    E Preencho meu email  teste@teste.com
#    E Prencho minha cor favorita
#    E Preencho minha comida favorita
#    E Preencho minha sobremesa favorita
#    E Respondo o quanto gosto de animais
#    E Respondo o quanto considero o eSport
#    E Respondo o quanto considero o Baseball
#    E Respondo o quanto considero o Futebol
#    E Respondo o quanto considero o Rugby
#    E Preencho os ingredientes Pão Carne Queijo Ovo Salada do sandwich EggXburguer
#    E Preencho os ingredientes Pão Queijo Ovo Salada do sandwich Vegetariano
#    E Preencho os ingredientes Pão Carne Queijo Salada do sandwich Xburguer
#    E Preencho os ingredientes Pão Carne do sandwich Hamburguer
#    E Respondo que o dia hoje é
#    E Prencho a hora inválida 25:00
#    E Clico em enviar
#    Então Verifico a mensagem Hora inválida
#
#
#
#
#
#
