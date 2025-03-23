import { Outlet } from "react-router";

export default function Dashboard() {
  return (
    <div>
      <h1 className="my-10">Quran Viewer</h1>
      <hr className="my-1" />
      <hr className="my-1" />
      <Outlet />
    </div>
  );
}
