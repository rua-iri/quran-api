import { Outlet } from "react-router";
import DashboardHeader from "../components/DashboardHeader";
import "../App.css";

export default function Dashboard() {
  return (
    <div>
      <DashboardHeader />

      <Outlet />
    </div>
  );
}
