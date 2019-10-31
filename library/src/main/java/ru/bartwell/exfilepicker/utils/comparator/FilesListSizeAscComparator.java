package ru.bartwell.exfilepicker.utils.comparator;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

import java.io.File;

/**
 * Created by BArtWell on 28.02.2017.
 */
class FilesListSizeAscComparator extends FilesListComparator {
    @Override
    @IntRange(from = -1, to = 1)
    int compareProperty(@NonNull File file1, @NonNull File file2) {
        return Long.valueOf(file1.length()).compareTo(file2.length());
    }
}
