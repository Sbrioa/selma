/*
 * Copyright 2013  Séven Le Mesle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package fr.xebia.extras.selma.it.tostring;

import fr.xebia.extras.selma.Mapper;

/**
 * Created by slemesle on 08/06/2017.
 */
@Mapper(withIgnoreNullValue = true)
public interface PrimitivesOrBoxedToStringMapper {

    // Boxed To String
    StringContainer embeddedBoxedToString(BoxedContainer in);

    StringContainer embeddedBoxedToString(BoxedContainer in, StringContainer out);

    // Primitive To String
    StringContainer embeddedPrimitiveToString(IntContainer in);

    StringContainer embeddedPrimitiveToString(IntContainer in, StringContainer out);


    class IntContainer {
        private int flag;

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }
    }

    class BoxedContainer {
        private Boolean flag;

        public Boolean getFlag() {
            return flag;
        }

        public void setFlag(Boolean flag) {
            this.flag = flag;
        }
    }

    class StringContainer {
        private String flag;

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }
    }
}