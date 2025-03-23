import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import { BrowserRouter, Route, Routes } from "react-router";
import "./index.css";
import Dashboard from "./views/Dashboard.jsx";
import HomePage from "./views/HomePage.jsx";
import SurahDetail from "./views/SurahDetail.jsx";

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Dashboard />}>
          <Route index element={<HomePage />} />
        </Route>
        <Route path="/surah" element={<Dashboard />}>
          <Route path="/surah/:pid" element={<SurahDetail />} />
        </Route>
      </Routes>
    </BrowserRouter>
  </StrictMode>
);
