const baseURL = "/example";

export async function getAllSurahs() {
  const response = await fetch(`${baseURL}/allSurahs.json`);


  if (response.status == 200) {
    const data = await response.json();

    return data;
  }
}
