

package Restassured.Restassured;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.StoryControls;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import Restassured.Restassured.StackSteps;

public class MultipleStory extends JUnitStories {

                // Here we specify the configuration, starting from default
                // MostUsefulConfiguration, and changing only what xis needed
                @Override
                public Configuration configuration() {
                                return new MostUsefulConfiguration()
                                // where to find the stories
                                                                .useStoryLoader(new LoadFromClasspath(this.getClass()))
                                                                // CONSOLE and TXT reporting
                                                                //.useStoryControls(new StoryControls().doResetStateBeforeScenario(false))
                                                                .useStoryReporterBuilder(
                                                                                                new StoryReporterBuilder().withDefaultFormats()
                                                                                                                                .withFormats(Format.CONSOLE, Format.TXT));
                }


                public InjectableStepsFactory stepsFactory() {
                      return new InstanceStepsFactory(configuration(), new StackSteps());
                  }
                
                    protected List<String> storyPaths() {
                        String filter = System.getProperty("story.filter", "**/*.story");
                        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), filter, "**/*.story,**/given_relative_path*");
                    }
}



