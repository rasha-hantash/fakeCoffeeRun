package com.cmsc355.coffeerun.States;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Interpolation;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mock.*;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class MenuStateTest{
    GameStateManager gsm = new GameStateManager();
    //MenuState menu;
    @Mock
    private MenuState menuState = Mockito.mock(MenuState.class);


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void handleInput() {
        //write a few lines of code, look at code/user story
        //study for it by going through all of the slides
        //metric meaning some value you can get at
        //first part of solid could be on exam
        //
    }

    @Test
    public void update() {
    }

    @Test
    public void render() {
    }

    @Test
    public void dispose() {
    }

    @Test
    public void testGameStateStack_OnMenu(){
        MenuState menu = new MenuState(gsm,"","",""); //constructor with not texture instantiated
        menu.setCurrentState(menu);
        String gsmStateString = gsm.getCurrentState();
        gsmStateString = gsmStateString.substring(1, gsmStateString.length()-1);



        System.out.println(gsmStateString);
        System.out.println(menu);
        assertEquals(gsmStateString,menu.toString());
    }

    @Test
    public void testGameStateStack_OnMenu_Mockito(){
        MenuState menuState = Mockito.mock(MenuState.class);

        //Mockito.doCallRealMethod().when(menuState).setCurrentState(Mockito.any(MenuState.class));
        //menuState.setCurrentState(menuState);
        gsm.push(menuState);

        //(menuState).setCurrentState(menuState);
        String gsmStateString = gsm.getCurrentState();
        String menuStateString = menuState.toString();


        gsmStateString = gsmStateString.substring(1, gsmStateString.length()-1);
        when(menuState.getCurrentState()).thenReturn(menuStateString);
        assertEquals(gsmStateString, menuState.getCurrentState());
    }

    @Test
    public void testGameStateStack_ClickOnPlayState(){
       MenuState menuState = Mockito.mock(MenuState.class);


       //Texture playButton = new Texture(Gdx.graphics.getWidth()/2 - (playButton.getWidth()/2), Gdx.graphics.getHeight()/2-(playButton.getHeight()/2), "playbuttonsmall.png");
      // menuState.setClickposition(Gdx.graphics.getWidth()/2 - (playButton.getWidth()/2),Gdx.graphics.getHeight()/2-(playButton.getHeight()/2),0);
       menuState.clickPlaybutton();
       //when(menuState.getCurrentState()).thenReturn();
        gsm.push(Mockito.mock(PlayState.class));
        String gameStateString = gsm.getCurrentState();

        
    }



    //Create a method in Menu State that simulates when an image is clicked on?
    //It could have a parameter for where it needs to be clicked
    //Create a method that pushes on game state
    //Create a test to make sure clicking on play button access PlayState
    //Create a test to make sure clicking on character button access CharacterState
    //              (create a method that clicks on the correct area of the button)
}