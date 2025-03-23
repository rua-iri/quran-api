const baseURL = "/example";

export async function getAllSurahs() {
  const response = await fetch(`${baseURL}/allSurahs.json`);

  if (response.status == 200) {
    const data = await response.json();

    return data;
  }
}

export async function getSurahByID(surahNumber) {
  const response = await fetch(`${baseURL}/surah114.json`);

  if (response.status == 200) {
    const data = await response.json();
    return data;
  }
}
