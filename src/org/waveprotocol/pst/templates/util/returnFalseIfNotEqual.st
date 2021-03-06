/**
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
 */

$if (f.optional)$

  if ($target1$.has$f.capName$() != $target2$.has$f.capName$()) return false;
  $if (f.primitive)$
    if ($target1$.has$f.capName$() && ($target1$.$f.getter$() != $target2$.$f.getter$())) return false;
  $elseif (f.message)$
    if ($target1$.has$f.capName$() && !$f.javaType$.isEqual($target1$.$f.getter$(), $target2$.$f.getter$())) return false;
  $else$
    if ($target1$.has$f.capName$() && !$target1$.$f.getter$().equals($target2$.$f.getter$())) return false;
  $endif$

$elseif (f.repeated)$

  $if (f.message)$
    if (!$f.javaType$.areAllEqual($target1$.$f.getter$(), $target2$.$f.getter$())) return false;
  $else$
    if (!$target1$.$f.getter$().equals($target2$.$f.getter$())) return false;
  $endif$

$else$

  $if (f.primitive)$
    if ($target1$.$f.getter$() != $target2$.$f.getter$()) return false;
  $elseif (f.message)$
    if (!$f.javaType$.isEqual($target1$.$f.getter$(), $target2$.$f.getter$())) return false;
  $else$
    if (!$target1$.$f.getter$().equals($target2$.$f.getter$())) return false;
  $endif$

$endif$
