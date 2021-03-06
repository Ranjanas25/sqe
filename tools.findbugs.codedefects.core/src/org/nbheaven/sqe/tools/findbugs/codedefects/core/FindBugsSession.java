/* Copyright 2005,2006 Sven Reimers, Florian Vogler
 *
 * This file is part of the Software Quality Environment Project.
 *
 * The Software Quality Environment Project is free software:
 * you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation,
 * either version 2 of the License, or (at your option) any later version.
 *
 * The Software Quality Environment Project is distributed in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.nbheaven.sqe.tools.findbugs.codedefects.core;

import javafx.beans.value.ObservableObjectValue;
import org.nbheaven.sqe.codedefects.core.api.QualitySession;
import org.nbheaven.sqe.tools.findbugs.codedefects.core.internal.FindBugsSessionImpl;
import org.openide.filesystems.FileObject;

/**
 *
 * @author Sven Reimers
 */
public interface FindBugsSession extends QualitySession {

    @Override
    public FindBugsQualityProvider getProvider();

    @Override
    public ObservableObjectValue<? extends FindBugsResult> getResultProperty();

    @Override
    public FindBugsResult getResult();

    @Override
    public FindBugsResult computeResultAndWait();

    public static FindBugsResult computeResultAndWait(FileObject sourceFile) {
        return FindBugsSessionImpl.computeResultAndWait(sourceFile);
    }
}
