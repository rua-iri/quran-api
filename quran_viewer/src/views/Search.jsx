import { useEffect, useRef, useState } from "react";
import { searchAyahByContent } from "../utils/searchSurahs";

export default function Search() {
  const [resultsItems, setResultsItems] = useState([]);
  const fieldsetRef = useRef();

  async function getSearchResults(searchString) {
    const data = await searchAyahByContent(searchString);

    console.log(data);

    setResultsItems(data);
  }

  function handleSubmit(event) {
    event.preventDefault();
    fieldsetRef.current.disabled = true;
    const searchString = event.target.searchString.value;
    console.log(event.target);
    console.log(searchString);

    getSearchResults(searchString);
  }

  useEffect(() => {}, []);

  return (
    <div className="py-5 mx-10 rounded outline outline-slate-800">
      <h1 className="text-xl font-semibold mb-4">Search</h1>
      <form onSubmit={(event) => handleSubmit(event)}>
        <fieldset ref={fieldsetRef}>
          <input
            className="mx-1 w-56 rounded outline outline-slate-800"
            type="text"
            name="searchString"
          />
          <input
            className="mx-1 px-3 rounded outline outline-slate-800"
            type="submit"
            value="Search"
            name="submitButton"
          />
        </fieldset>
      </form>
    </div>
  );
}
