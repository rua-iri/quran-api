import { Outlet } from "react-router";

export default function Dashboard() {
  return (
    <div>
      <h1>Quran Viewer</h1>
      <hr />
      <hr />
      <Outlet />
    </div>
  );
}
