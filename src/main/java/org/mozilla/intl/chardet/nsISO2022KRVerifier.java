/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is mozilla.org code.
 *
 * The Initial Developer of the Original Code is
 * Netscape Communications Corporation.
 * Portions created by the Initial Developer are Copyright (C) 1998
 * the Initial Developer. All Rights Reserved.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either of the GNU General Public License Version 2 or later (the "GPL"),
 * or the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

/*
 * DO NOT EDIT THIS DOCUMENT MANUALLY !!!
 * THIS FILE IS AUTOMATICALLY GENERATED BY THE TOOLS UNDER
 *    AutoDetect/tools/
 */

package org.mozilla.intl.chardet;

public class nsISO2022KRVerifier extends nsVerifier {

  static int[] cclass;
  static int[] states;
  static int stFactor;
  static String charset;

  public nsISO2022KRVerifier() {

    cclass = new int[256 / 8];

    cclass[0] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (2)));
    cclass[1] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[2] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[3] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((1) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[4] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (3))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[5] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((4) << 4) | (0)));
    cclass[6] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[7] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[8] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((5) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[9] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[10] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[11] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[12] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[13] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[14] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[15] = ((((((0) << 4) | (0)) << 8) | (((0) << 4) | (0))) << 16) | (((((0) << 4) | (0)) << 8) | (((0) << 4) | (0)));
    cclass[16] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[17] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[18] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[19] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[20] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[21] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[22] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[23] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[24] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[25] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[26] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[27] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[28] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[29] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[30] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));
    cclass[31] = ((((((2) << 4) | (2)) << 8) | (((2) << 4) | (2))) << 16) | (((((2) << 4) | (2)) << 8) | (((2) << 4) | (2)));

    states = new int[5];

    states[0] = ((((((eError) << 4) | (eError)) << 8) | (((eStart) << 4) | (eStart))) << 16)
        | (((((eStart) << 4) | (eError)) << 8) | (((3) << 4) | (eStart)));
    states[1] = ((((((eItsMe) << 4) | (eItsMe)) << 8) | (((eItsMe) << 4) | (eItsMe))) << 16)
        | (((((eError) << 4) | (eError)) << 8) | (((eError) << 4) | (eError)));
    states[2] =
        ((((((eError) << 4) | (eError)) << 8) | (((4) << 4) | (eError))) << 16) | (((((eError) << 4) | (eError)) << 8) | (((eItsMe) << 4) | (eItsMe)));
    states[3] =
        ((((((eError) << 4) | (eError)) << 8) | (((eError) << 4) | (5))) << 16) | (((((eError) << 4) | (eError)) << 8) | (((eError) << 4) | (eError)));
    states[4] = ((((((eStart) << 4) | (eStart)) << 8) | (((eStart) << 4) | (eStart))) << 16)
        | (((((eItsMe) << 4) | (eError)) << 8) | (((eError) << 4) | (eError)));

    charset = "ISO-2022-KR";
    stFactor = 6;

  }

  @Override
  public int[] cclass() {
    return cclass;
  }

  @Override
  public int[] states() {
    return states;
  }

  @Override
  public int stFactor() {
    return stFactor;
  }

  @Override
  public String charset() {
    return charset;
  }

  @Override
  public boolean isUCS2() {
    return false;
  }


}
