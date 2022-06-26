@TutorialPage
Feature: Tutorial Page

  @Check @Components
  Scenario Outline: Check Tutorial Page Components
    Given Customer  opened LcWaikiki App
    Then should see TvTutorial
    Then should see "<text>" text
    Then should see "<title>" tutorial-title
    Then should see "<desc>" title description
    Then should see "<button>" button
    Examples:
      | text            | title           | desc                                                                                               | button |
      | Yeniliği Keşfet | PRATİK ALT MENÜ | Yenilenen alt menü ile kategorilere, sepetine, favorilerine ve profiline kolaylıkla ulaşabilirsin.| Atla   |

  @DragDrop
  Scenario Outline: Check Drag Drop TvTutorial
    Given Customer  opened LcWaikiki App
    When drag and drop TvTutorial
    Then should see "<title>" tutorial-title
    Examples:
      | title             |
      | KATEGORİ GÖRÜNÜMÜ |

  @Skip
  Scenario: Click Skip Button
    Given Customer  opened LcWaikiki App
    When click Skip button
    Then should see AppHomePage





