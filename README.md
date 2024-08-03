#### Working.

incomplete!
# AdvancedSpring-IntegrationTesting_SpringBoot
Advanced Spring : Integration Testing with Spring Boot  Li


Notes:
Using most common annotations.

*********************************************************************
        JUNIT 5
@Test
@BeforeAll
@Nested
@DisplayName

        SPRING BOOT TEST    

@SpringBootTest
@DataJpaTest
@WebMVCTest
@MockBean

        Mockito

@Mock
@InjectMock
when.(...).then(...)
given(...)

        AssertJ

assertThat(...)
        .hasSize(...)
        .contains(...)
        .doesNoteContain(...)

assertThat(...)
        .startWith(...)
        .endsWith(...)

        Json

assertEquals(
    "{id:123}",actual,...
);

        JSON Path

$.store.book[*].author

$.store.book[0].title






















