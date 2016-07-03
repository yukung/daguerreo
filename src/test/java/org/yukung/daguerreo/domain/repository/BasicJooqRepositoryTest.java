/*
 * Copyright 2016 Yusuke Ikeda
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
 */

package org.yukung.daguerreo.domain.repository;

import org.jooq.impl.DefaultRecordMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yukung.daguerreo.Application;
import org.yukung.daguerreo.domain.entity.BookApi;
import org.yukung.daguerreo.infrastructure.tables.records.BookApiRecord;

import static org.assertj.core.api.Assertions.*;

/**
 * Unit tests for {@link BasicJooqRepository}.
 *
 * @author yukung
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class BasicJooqRepositoryTest {

    @Autowired
    private DummyRepository repository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void table() throws Exception {
        assertThat(repository.table()).isNotNull();
        assertThat(repository.table().getName()).isEqualToIgnoringCase("book_api");
    }

    @Test
    public void entityClass() throws Exception {
        assertThat(repository.entityClass()).isNotNull().isEqualTo(BookApi.class);
    }

    @Test
    public void mapper() throws Exception {
        assertThat(repository.mapper()).isNotNull().isExactlyInstanceOf(DefaultRecordMapper.class);
    }

    @Test
    public void findAll() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void findAllByIds() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void findAllByAscendingSort() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void findAllByDescendingSort() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void findAllByPageable() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void findAllByPageableAndDescendingSort() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void findOne() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void findOneNotExists() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void exists() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void notExists() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void count() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void insertByAutoGeneratedId() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void insertBySpecifiedId() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void insertNull() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void update() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void multiSave() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void deleteById() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void deleteByNotExistsId() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void deleteByEntity() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void multiDelete() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void deleteInBatch() throws Exception {
        fail("implementation not yet.");
    }

    @Test
    public void deleteAll() throws Exception {
        // when
        Throwable thrown = catchThrowable(() -> repository.deleteAll());

        // then
        assertThat(thrown)
            .isInstanceOf(UnsupportedOperationException.class)
            .hasMessage("deleteAll() is not supported.");
    }

    @Repository
    public static class DummyRepository
        extends BasicJooqRepository<BookApiRecord, org.yukung.daguerreo.infrastructure.tables.BookApi, BookApi, Integer> {
    }
}