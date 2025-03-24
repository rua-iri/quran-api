const baseURL = "/example";

export async function searchAyahByContent(textContent) {
  const response = await fetch(`${baseURL}/searchContent.json`);

  if ((await response).status == 200) {
    const data = await response.json();

    return data;
  }
}
