import React from 'react';

const SampleForm = () => {
    return (
        <form>
            <input type="text" />
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
