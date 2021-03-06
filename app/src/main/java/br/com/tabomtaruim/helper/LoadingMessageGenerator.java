package br.com.tabomtaruim.helper;

import java.util.Random;

public class LoadingMessageGenerator {
//fonte das frases http://pontopackage.wordpress.com/2009/03/11/as-frases-reticuladas-dos-reticulos-premiados/

    private static String[] loading = {"Fazendo Por-do-Sol Perfeiro",
            "Carregando Retículos Milimétricamente Calculados",
            "Arrumando Cesta de Piquenique",
            "Distribuindo Celulares para as Fofocas",
            "Preparando os Quadris para a dança",
            "Educando Bebes inducáveis",
            "Avaliando Nova Geração",
            "Substituindo Cor dos Cabelos",
            "Abrindo as Portas para um Novo Mundo",
            "Colhendo Bifes do Pé",
            "Destruindo Barreiras da Vizinhança",
            "Reticulando Retículos para Terceira Geração",
            "Expressando Novas Expressões Faciais",
            "Pescando Peixes-Robô",
            "Criando Tabela de Texturas",
            "Espantando Formigas do Piquenique",
            "Selecionando e Alterando Personalidades",
            "Mudando Toque do Celular",
            "Preparando-se Para Entrar Num Novo Mundo",
            "Enchendo lagos com peixes",
            "Carregando cestas de piquenique",
            "Criando nova rede de retículos",
            "Liberando espaço na vizinhança",
            "Parando um pouco na praia para olhar as ondas",
            "Comprando livros novos para as estantes",
            "Colhendo vegetais para o jantar",
            "Contratando funcionários do SPA",
            "Mandando os fantasmas assustarem em silêncio",
            "Indo para o hospital para parto de emergência",
            "Otimizando luzes de estúdio",
            "Lustrando pára-choques diagonais",
            "Reestruturando retículos desalinhados",
            "Afiando cortador de grama",
            "Convocando jornaleiros e carteiros",
            "Ensacando sementes de girassóis",
            "Recolhendo animais perdidos",
            "Adestrando pássaros e insetos",
            "Desarrumando nuvens",
            "Provocando dia ensolarado",
            "Removendo telas de carregamento",
            "Combinando traços de personalidade",
            "Unificando a vizinhança",
            "Gerando nova geração",
            "Substituindo retículos anteriormente reticulados",
            "Construindo lotes comunitários",
            "Texturizando tudo que estiver pela frente",
            "Editando livros de culinária",
            "Modernizando cortes de cabelo",
            "Calibrando pneus das bicicletas",
            "Explorando Vizinhança não explorada.",
            "Abrindo portas para o mundo livre",
            "Criando Personalidades pessoais",
            "Criando novos gráficos",
            "Reticulando Retículos não Reticulados",
            "Abrindo portões do cemitério",
            "Criando a prefeitura.",
            "Bisbilhotando os bisbilhoteiros",
            "Abrindo o tapete vermelho",
            "Calibrando engenhocas;",
            "Ativando interações sociais;",
            "Criando Realidade Realística;",
            "Recriando Retículos para serem reticulados;",
            "Texturizando texturas;",
            "Vizualizando Vizinhança;",
            "Organizando Empregos;",
            "Redistribuindo Aspirações;",
            "Testando Medidores de Popularidade.",
            "Diversificando personalidades únicas.",
            "Calibrando pneus novos.",
            "Preparando exercitos de formigas.",
            "Analisando lapides e sepulturas.",
            "Contando grãos de areia.",
            "Personalizando novos retículos reticulados.",
            "Desenhando placas de protesto.",
            "Customizando roupas e casas.",
            "Preparando muitas fraldas ‘buaa.",
            "Saboreando novos pratos ‘huum.",
            "Queimando telas de loading.",
            "Preparando cestas de piquenique",
            "Programando rede de celulares",
            "Gerando personalidades aleatórias",
            "Calibrando dispositivo temporal não-paradoxal",
            "Assando Tortinhas de chocolate",
            "Remasterizando vozes simlescas com balinhas de menta",
            "Parando para espionar o vizinho",
            "Enchendo pneus de bicicletas",
            "Fabricando baldes de tinta texturizada",
            "Retículos jovens passam correndo reticuladamente, zuuum!",
            "Estilizando Botões do Crie-Um-Estilo",
            "Caminhando Contra O Vento, Sem Lenço, Sem Documento",
            "Testando Diferentes Texturas",
            "Enterrando Mapa-Astral de Laura",
            "Posicionando Coisas Frágeis Cuidadosamente",
            "Teorizando Sobre Gravidez Espectral",
            "Contratando Cabeleireiros Chiquérrimos",
            "Ilustrando Pôsteres de Ilustres",
            "Gerando Retículos da Terceira Geração",
            "Procurando Roupa-de-Baixo Debaixo Da Cama",
            "Organizando orbitas do sol e da lua.",
            "Preenchendo a gordurinha e os músculos dos sims.",
            "Exterminando as barras de carregamento.",
            "Fazendo uma paradinha para ver a beleza do mar.",
            "Compartilhando piquenique com sims mais pobres.",
            "Ajeitando a pintura e a jante dos carros.",
            "Dando fôlego de Vida aos sims da vizinhança.",
            "Botando os retículos de novo para eles se reticularem novamente.",
            "Conectando a união dos sims com os jogadores.",
            "Reticulando Retículos de um RockStar",
            "Configurando um Portal Tridimensional",
            "Colorindo Bicicletas Coloridas",
            "Ressucitando Fantasmas Trapalhões",
            "Criando Cabelos Estranhos",
            "Extraindo Investigações Sobre Laura Caixão",
            "Comprimentando Moradores Novos",
            "Colorindos Roupas em Neon",
            "Voltando A Reticular Os Reticulos Desreticulados",
            "Criando Perfil Único",
            "Caminhando Beira-Mar",
            "Puxando O Saco Do Chefe",
            "Explorando A Vizinhança",
            "Envelhecendo Com Os Vizinhos",
            "Recolorindo Objetos",
            "Separando Personalidades Diferentes",
            "Ajustando Timbres De Voz",
            "Personalizando Cenário À Seu Gosto",
            "Criando Toalhas Para o Piquinique",
            "Explorando a Vizinhança Infinita que é sem fim",
            "Atropelando Pessoas Pela Rua",
            "Criando Placas Para Protestos",
            "Informando os ET’s sobre o Telescópio",
            "Criando Visuais Estranhamente Estranho",
            "Contratando os Retículos Contratados Mais um Vez",
            "Aumentando dias de vida da Vizinhança",
            "Implantando Botas Carnívora no Lago",
            "Gerando Níveis Personalizados Únicos",
            "Desreticulisando retículos já reticularisados",
            "Gerando vizinhos raivosos",
            "Criando novas roupas estilosas",
            "Destruindo antigas casas",
            "Configurando novos empregos e seus chefes estressados",
            "Generalizando rede de internet e bate-papo",
            "Chamando novos arquitetos",
            "Comprando cimento e tijolos",
            "Instalando hidrelétricas",
            "Construindo postes nas calçadas",
            "Convencendo Criadores a Reticular Retículos Mais Uma Vez",
            "Tentando Criar Sims Menos Feios",
            "Implantando Traços de Personalidade Inúteis",
            "Fazendo Você Ler Isso Para Se Distraír Em Quanto Carrega",
            "Criando Personalização Personalizada",
            "Você Viu A Laura Caixão?",
            "Plantando Flores de Plástico",
            "Liberando Liberdade Pela Vizinhança",
            "Deixando Prismas Verdinhos e Bonitinhos",
            "Quebrando o muro da vizinhança",
            "Procurando retículos reticulados em 3D",
            "Pintando túmulos",
            "Censurando códigos de censura",
            "Aguarde um instante…",
            "Retículos ao Ar Livre Reticulados",
            "Gerando vizinhos irritantes",
            "Praças ar-ar-ar-borizadas completas",
            "Regulando os fantasmas sumidos",
            "Cleptomaníacos cleptando objetos cleptomizados",
            "Carregando guitarras das celebridades",
            "Requisitando doces de crianças",
            "Prevendo o índice de personalidades",
            "Avaliando pneus de bicicletas",
            "Criando DNA personalizável",
            "Desencorajando “Retículos” Bugados do Jogo;",
            "Simulando Briga com Vizinha Assanhada;",
            "Trocando Farpas com Sra. Rugabaixa;",
            "Encorajando Corajosos na Criação de Novas Meshes e Recolours;",
            "Fugindo de Imprevistos e Encrencas;",
            "Tomando ar Fresco e Relaxando na Sombra da Árvore do Vizinho;",
            "Polindo Carros Desbotados Pela Ação do Tempo;",
            "Encontrando com Espectro de Laura Caixão;",
            "Fechando Zíper de Bolsas, Calças e Camisas;",
            "Despenteando Cabelos com Vento Inesperado em Piquenique.",
            "Reticulos Rasterizados.",
            "Polindo Televisões.",
            "Deixando pisos mais brilhantes.",
            "Modificando Àrvores Genealógicas.",
            "Deixando vizinhança mais confiavel.",
            "Polindo jóias.",
            "Colocando mais vizinhanças.",
            "Colocando brinquedos novos.",
            "Colocando mais roupas para bebês.",
            "Colocando mais escadas.",
            "Detectando baratas no jardim",
            "Trocando pilhas dos vagalumes",
            "Examinando caretas da moda",
            "Reciclando retículos resfriados",
            "Sacudindo insetos na roupa",
            "Estimando Estimativa de passos consecutivos",
            "Desentupindo canos de descarga",
            "Extrapolando capacidade da lata de lixo",
            "Estipulando coeficientes de doação de ruínas",
            "Espalhando jornais ao vento",
            "Aposentando os retículos anteriormente reticulados… e contratando novos!",
            "Construindo castelinhos na areia",
            "Desentupindo o banheiro…",
            "Catando as penas da briga de travesseiros",
            "Arracando as ervas daninhas do jardim",
            "Chutando a lixeira do vizinho",
            "Preparando feitiço para fazer sumir as contas",
            "Flertando com o Don Lotário",
            "Atendendo o telefone irritantemente insistente",
            "Localizando a Laura Caixão.",
            "Melancolizando Funerais",
            "Readiquirindo Estampas",
            "Identificando Objetos Larapiados",
            "Materializando Ectoplasmas",
            "Retículos Unicamente Reticulados",
            "Encubando Recém-nascidos na Maternidade",
            "Concertando Correntes de Bicicletas",
            "Doutores Devidamente Remunerados",
            "Protestos Civilizadamente Contidos",
            "Realizando Manutenção de Rodovias",
            "Acordando retículos para serem reticulados de novo.",
            "Fabricando roupas para sims gordinhos.",
            "Tentando desencalhar Vladmir Caixão.",
            "Sossegando o Vale do Sossego.",
            "Pintando out-doors.",
            "Comprando sapatos da moda.",
            "Preparando comida para vegetarianos.",
            "Comprando iscas de pesca.",
            "Paquerando o chefe para ganhar aumento.",
            "Lavando bicicletas para o final de semana.",
            "Reticulando Retículos já reticulados",
            "Personalizando personalidades",
            "Preparando visitas aos vizinhos",
            "Unificando sims Únicos",
            "Possibilizando possibilidades impossibilitadas",
            "Conectando vizinhanças",
            "Incrementando prismas",
            "Criando sims paranóicos",
            "Complementando inteligência artificial",
            "Detalhando sims gordinhos",
            "Adcionando um Pouco de Sossego na Vila Sunset",
            "Posicionando Alturas e Modernizando Lajes e Telhados",
            "Rejuvenecendo Laura Caixão e Cia.",
            "Vestindo com Luxo a Dona Morte, e laminando foice suja!",
            "Trocando Chuva e Neve por Sol e Mais Nada",
            "Arrumando Personalidades e Costurando Meias para Chinelos",
            "Aguardando Futura Humilhação Gráfica de Edições Anteriores (ou não)",
            "Solicitando Ondas do Mar e um Sanduíche de Queijo Grelhado",
            "Reticulando Possíveis Retículos Reticuláveis Mal Reticulados Anteriormente",
            "Reticulando os retículos³.",
            "Escondendo habilidades do painel.",
            "Rejuvenescendo Sra. Rugabaixa.",
            "Afogando peixes no laguinho da prefeitura.",
            "Ramificando galhos de diferentes árvores iguais.",
            "Re-emporcelanando peles pós-emporcelanadas.",
            "Levando telas de carregamento para a Dona Morte",
            "Cristalizando prismas.",
            "Materializando sims materialistas.",
            "Oba-obando grávidas que vão para o hospital.",
            "Reticulando Retículos em Tempo Real",
            "Ajustando Posição do Sol",
            "Personalizando Personalidades Individuiais",
            "Prevendo Pôr-do-Sol à Beira-Mar",
            "Projetando Sombras em Lugares Sombrios",
            "Organizando Livros em Ordem Alfabética",
            "Randomizando Ladrões de Jornal Alheio",
            "Mudando as Paredes de Lugar",
            "Regando as Árvores Genealógicas",
            "Gerando Livre-arbítrio",
            "Sentindo cheiro de carro novo",
            "Personalizando texturas personalizáveis",
            "Criando traços de personalidade",
            "Roubando os retículos do vizinho",
            "Organizando greve municipal!",
            "Preparando sala de cirurgia",
            "Grelhado de queijo em oferta!",
            "Sequenciando fases do dia",
            "Devolvendo doces ás crianças",
            "Combinando textura do sofá com o top da vizinha",
            "Desativando prisma de segunda mão",
            "Retirando retículos da maquiagem",
            "Armando cabana no quintal",
            "Limpando o lixo do lixo sujo",
            "Trocando pneu furado",
            "Pescando sardinha na fonte da praça",
            "Desviando de pedras na calça do parque",
            "Correndo do cachorro do vizinho",
            "Trocando pilhas do controle remoto",
            "Gerando IMC’s acima de 30",
            "Roubando retículos impulsivamente",
            "Afofando textura de tijolinhos em tecidos",
            "Esverdeando a grama do vizinho",
            "Guerreando contra as horrorosas baratas vermelhas alienígenas!",
            "Verificando as validades das ofertas",
            "Endoidando o tempo cronológico das edições",
            "Criando Fantasmas fantasmagóricos",
            "Customizar retículos Familiares",
            "Adoçando Pirulitos",
            "Colocando Peixes no Aquário",
            "Enchendo os pneus das bicicletas",
            "Criando Cidade além das esquinas",
            "Anotando Receitas nos Livros",
            "Chocando Ovos dos Insetos",
            "Limpando as Piscinas",
            "Iniciando Processo de Arborização",
            "Derrubando fronteiras para a vizinhança",
            "Alimentando e olhando direito as crianças para que não comam comida de animais",
            "Arrumando namoros impossíveis e deixando pais de cabelos brancos",
            "Ensinando aos retículos a reticularem direito",
            "Prevenindo homens de engravidar de ETs",
            "Amarrando Dom Lotário a Brenda Malpaga",
            "Ensinando gatos a arranharem somente pernas de vizinhos chatos",
            "Casando Cassandra Caixão com Pé Grande",
            "Ajudando Lilite a entrar para um convento",
            "Transformando Dina e Nina Caliente em beatas",
            "Reticulando Reticulos pela Primeira Vez",
            "Criando dia e noite",
            "Carregando Vizinhança Livre",
            "Distância Social de Calibragem",
            "Carregando Ferramentas",
            "Carregando Vizinhos da Vizinhança",
            "Carregando Sons dos Celulares",
            "Carregando Posições do Dia",
            "Carregando Areia da Praia",
            "Carregando Água da Praia",
            "Expulsando os retículos do piquenique",
            "Imprimindo cartelas de adoção",
            "Gerando personalidade mui malvada",
            "Impedindo fãs de atacarem a Estrela do Rock",
            "Editando músculos do halterofilista",
            "Libertando liberdade alheia",
            "Preparando super-receita da vovó",
            "Assustando os fantasmas",
            "Canalizando nuvens de caos"};


    public static String randomOne(){
        Random rand = new Random();
        return loading[rand.nextInt((loading.length-1 - 0) + 1)];
    }
}