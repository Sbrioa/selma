/*
 * Copyright 2013 Xebia and Séven Le Mesle
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
package fr.xebia.extras.selma.it.collection;

import fr.xebia.extras.selma.CollectionMappingStrategy;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;
import fr.xebia.extras.selma.beans.*;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

import static fr.xebia.extras.selma.CollectionMappingStrategy.ALLOW_GETTER;

/**
 *
 */
@Mapper(withCollectionStrategy = ALLOW_GETTER)
public interface CollectionMapper {

    CollectionBeanDestination asCollectionBeanDestination(CollectionBeanSource source);

    CollectionBeanDestination asCollectionBeanDestination(CollectionBeanSource source, CollectionBeanDestination dest);

    CollectionBeanDefensiveDestination asCollectionBeanDefensiveDestination(CollectionBeanSource source);

    @Maps(withCollectionStrategy = CollectionMappingStrategy.ALLOW_GETTER)
    LinkedBlockingListBean asBlockingQueue(LinkedListBean llb);

}