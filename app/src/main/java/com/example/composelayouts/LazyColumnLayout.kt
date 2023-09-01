package com.example.composelayouts

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyColumnLayout() {
    val state = rememberLazyListState()
    val scope = rememberCoroutineScope()
    val showButton by remember {
        derivedStateOf { state.firstVisibleItemIndex > 0 }
    }

    Box {
        AnimatedVisibility(
            visible = showButton,
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {
            Button(onClick = {
                scope.launch { state.animateScrollToItem(index = 0) }
            }) {
                Text(text = "Scroll to top")
            }
        }
        LazyColumn(
            state = state,
            contentPadding = PaddingValues(30.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            stickyHeader {
                Text(text = "Heading")
            }
            item {
                Text(text = "New List")
            }
            items(100) { index ->
                Text(text = "Item $index")
            }
        }
    }

    //multiple sticky headers
    val grouped = contacts.groupBy { it.firstName[0] }
    LazyColumn(
        contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        item {
            Text(text = "Contacts", fontSize = 40.sp)
        }
        grouped.forEach { (initial, contactsForInitial) ->
            stickyHeader {
                Text(text = initial.toString())
            }
            items(contactsForInitial) { contact ->
                Text(
                    text = "${contact.firstName} ${contact.lastName}: ${contact.phoneNumber}",
                    modifier = Modifier.padding(start = 20.dp)
                )
            }
        }
    }


    LazyRow() {
        items(100) {
            Text(text = "Item $it")
        }
    }
}

data class Contact(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String
)

val contacts = listOf(
    Contact("Alice", "Anderson", "123-456-7890"),
    Contact("Amo", "Anderson", "123-456-7890"),
    Contact("Anil", "Anderson", "123-456-7890"),
    Contact("Adnan", "Anderson", "123-456-7890"),
    Contact("Alan", "Anderson", "123-456-7890"),
    Contact("Bob", "Brown", "234-567-8901"),
    Contact("Babar", "Brown", "234-567-8901"),
    Contact("Bobby", "Brown", "234-567-8901"),
    Contact("Bella", "Brown", "234-567-8901"),
    Contact("Blue", "Brown", "234-567-8901"),
    Contact("Ben", "Brown", "234-567-8901"),
    Contact("Charlie", "Clark", "345-678-9012"),
    Contact("Charlie", "Clark", "345-678-9012"),
    Contact("Chamika", "Clark", "345-678-9012"),
    Contact("Chandimal", "Clark", "345-678-9012"),
    Contact("Canara", "Clark", "345-678-9012"),
    Contact("Charles", "Clark", "345-678-9012"),
    Contact("David", "Davies", "456-789-0123"),
    Contact("Dravid", "Davies", "456-789-0123"),
    Contact("Donald", "Davies", "456-789-0123"),
    Contact("Eve", "Edwards", "567-890-1234"),
    Contact("Emma", "Edwards", "567-890-1234"),
    Contact("Elson", "Edwards", "567-890-1234"),
    Contact("Frank", "Franklin", "678-901-2345"),
    Contact("Free", "Franklin", "678-901-2345"),
    Contact("Former", "Franklin", "678-901-2345"),
    Contact("Grace", "Green", "789-012-3456"),
    Contact("Grape", "Green", "789-012-3456"),
    Contact("Guava", "Green", "789-012-3456"),
    Contact("Hannah", "Hall", "890-123-4567"),
    Contact("Hasan", "Hall", "890-123-4567"),
    Contact("Hali", "Hall", "890-123-4567"),
    Contact("Ian", "Irving", "901-234-5678"),
    Contact("Jill", "Johnson", "012-345-6789"),
    Contact("Kevin", "Kite", "123-456-7890"),
    Contact("Kite", "Kite", "123-456-7890"),
    Contact("Laura", "Lopez", "234-567-8901"),
    Contact("Mike", "Morrison", "345-678-9012"),
    Contact("Muna", "Morrison", "345-678-9012"),
    Contact("Miley", "Morrison", "345-678-9012"),
    Contact("Nina", "Nelson", "456-789-0123"),
    Contact("Neel", "Nelson", "456-789-0123"),
    Contact("Noman", "Nelson", "456-789-0123"),
    Contact("Oscar", "Olsen", "567-890-1234"),
    Contact("Osama", "Olsen", "567-890-1234"),
    Contact("Orlando", "Olsen", "567-890-1234"),
    Contact("Oman", "Olsen", "567-890-1234"),
)