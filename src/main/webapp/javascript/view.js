$(() => {
    const model = {
        categories: [
            {name: 'Claimant Information', content: [
                    {
                        title: 'Are you an individual, a law firm or an organisation?',
                        type: 'radio',
                        options: [
                            'An individual',
                            'A law firm or an organization'
                        ]
                    },
                    {
                        title: 'What is your full name?',
                        type: 'input-group',
                        questions: [
                            'First name and Middle name',
                            'surname',
                            'Trading name'
                        ]
                    }
                ] },
            {name: 'Defendant Information', content: '12'},
            {name: 'Claim Details', content: 'wefwecas'},
            {name: 'Claim Documents', content: 'abce'},
        ],
        currentCategory: '',
    }

    const octopus = {
        init: () => {
            model.currentCategory = model.categories[0];
            view.init();
            formView.init();
        },

        getAllCategories: () => model.categories,

        getCurrentCategory: () => model.currentCategory,

        setCurrentCategory: (category) => model.currentCategory = category,
    }

    const view = {
        init: () => {
            octopus.getAllCategories().forEach(category => {
                let listItem = document.createElement('li');
                listItem.textContent = category.name;
                listItem.addEventListener('click', (function(catCopy) {
                    return () => {
                        octopus.setCurrentCategory(catCopy); //tobi
                        formView.render();
                    };
                })(category))
                document.querySelector('ul').appendChild(listItem);
            })
        }
    }

    const formView ={
        init: () =>{
            this.fieldset = document.querySelector('fieldset');
            formView.render()
        },

        render: () => {
            const category = octopus.getCurrentCategory();
            console.log(category, 'L>>>>')
            let elem;
            category.content.forEach(cat => {
                if(cat.type === 'radio'){
                    elem =
                        `<p>{cat.title}</p>
                         <p>Here is a radio form input</p>                              
                         `
                } else if(cat.type === 'input-group') {
                    elem =  `<p>{cat.title}</p>
                         <p>Here is an input-group form input</p>                              
                         `
                }
            })
            this.fieldset.innerHTML = elem;
        }
    }
    octopus.init();
})
