import React from 'react';

const SampleForm = () => {
    const [test, setText] = React.useState('');

    return (
        <form>
            <input type="text" onChange = {
                (e) => {
                    setText(e.target.value);
                }
            } />
            <button>Submit</button>
        </form>
    );
}

const App = () => {
  return (
    <div>
      <h1>Hello World</h1>
    </div>
    <div>
      <SampleForm />
    </div>
  );
}

export default App;
