package de.strullerbaumann.visualee.dependency.entity;

/*
 * #%L
 * visualee
 * %%
 * Copyright (C) 2013 Thomas Struller-Baumann
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import de.strullerbaumann.visualee.dependency.boundary.DependencyContainer;
import de.strullerbaumann.visualee.filter.boundary.FilterContainer;
import de.strullerbaumann.visualee.source.boundary.JavaSourceContainer;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Thomas Struller-Baumann (contact at struller-baumann.de)
 */
public class DependencyTypeTest {

   public DependencyTypeTest() {
   }

   @Before
   public void init() {
      DependencyContainer.getInstance().clear();
      FilterContainer.getInstance().clear();
      JavaSourceContainer.getInstance().clear();

   }

   @Test
   public void testIsInverseDirection() {
      assertFalse(DependencyType.isInverseDirection(DependencyType.EJB));
      assertTrue(DependencyType.isInverseDirection(DependencyType.EVENT));
      assertFalse(DependencyType.isInverseDirection(DependencyType.INJECT));
      assertFalse(DependencyType.isInverseDirection(DependencyType.INSTANCE));
      assertTrue(DependencyType.isInverseDirection(DependencyType.MANY_TO_MANY));
      assertTrue(DependencyType.isInverseDirection(DependencyType.MANY_TO_ONE));
      assertTrue(DependencyType.isInverseDirection(DependencyType.OBSERVES));
      assertTrue(DependencyType.isInverseDirection(DependencyType.ONE_TO_MANY));
      assertTrue(DependencyType.isInverseDirection(DependencyType.ONE_TO_ONE));
      assertTrue(DependencyType.isInverseDirection(DependencyType.PRODUCES));
   }
}
