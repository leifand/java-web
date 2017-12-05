package com.la.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.la.web.models.Player;
import com.la.web.models.Roster;

/**
 * Servlet implementation class DeletePlayer
 */
@WebServlet("/deletePlayer")
public class DeletePlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePlayer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int teamId = Integer.valueOf(request.getParameter("teamId"));
		int playerId = Integer.valueOf(request.getParameter("playerId"));
		ArrayList<Player> players = Roster.allTeams.get(teamId).getPlayers();
		players.remove(playerId);
		response.sendRedirect("/Rosters/teams?id=" + teamId);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
