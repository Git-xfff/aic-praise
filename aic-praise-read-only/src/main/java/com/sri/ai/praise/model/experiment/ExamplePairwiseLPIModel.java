/*
 * Copyright (c) 2013, SRI International
 * All rights reserved.
 * Licensed under the The BSD 3-Clause License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 * 
 * http://opensource.org/licenses/BSD-3-Clause
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * 
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * 
 * Neither the name of the aic-praise nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES 
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) 
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, 
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.sri.ai.praise.model.experiment;

import com.google.common.annotations.Beta;
import com.sri.ai.praise.model.Model;

/**
 * <pre>
 * model(
 *     'ExamplePairwiseLPIModel',
 *     'Example Pairwise LPI Model for conversion to PMTK3 factors.',
 *     sort(OBJ, Unknown, {a, b}),
 *     randomVariable(p, 1, OBJ),
 *     randomVariable(q, 1, OBJ),
 *     randomVariable(r, 1, OBJ), 
 *     parfactors(
 *         {{ (on X) [if p(X) then (if q(X) then 0.6 else 0.4) else (if q(X) then 0.55 else 0.45)]}}, 
 *         {{ (on Y) [if p(Y) and q(Y) then 0.2 else 0.8] }}, 
 *         {{ (on Z) [if q(Z) then 0.1 else 0.9] }}, 
 *         {{ (on T) [if r(T) then 0.3 else 0.7] }}, 
 *         { [if r(a) and p(a) then 0.25 else 0.75], [if r(b) then (if p(b) then 0.65 else 0.35) else (if p(b) then 0.64 else 0.36)] }
 *     )
 * )
 *       
 * random variable names=p,q,r.
 * </pre>
 */
@Beta
public class ExamplePairwiseLPIModel extends Model {

	/**
	 * <pre>
	 * model(
	 *     'ExamplePairwiseLPIModel',
	 *     'Example Pairwise LPI Model for conversion to PMTK3 factors.',
	 *     sort(OBJ, Unknown, {a, b}),
	 *     randomVariable(p, 1, OBJ),
	 *     randomVariable(q, 1, OBJ),
	 *     randomVariable(r, 1, OBJ), 
	 *     parfactors(
	 *         {{ (on X) [if p(X) then (if q(X) then 0.6 else 0.4) else (if q(X) then 0.55 else 0.45)]}}, 
	 *         {{ (on Y) [if p(Y) and q(Y) then 0.2 else 0.8] }}, 
	 *         {{ (on Z) [if q(Z) then 0.1 else 0.9] }}, 
	 *         {{ (on T) [if r(T) then 0.3 else 0.7] }}, 
	 *         { [if r(a) and p(a) then 0.25 else 0.75], [if r(b) then (if p(b) then 0.65 else 0.35) else (if p(b) then 0.64 else 0.36)] }
	 *     )
	 * )
	 *       
	 * random variable names=p,q,r.
	 * </pre>
	 */
	public ExamplePairwiseLPIModel() {
		super(
				"model("
				+" 'ExamplePairwiseLPIModel', "
				+" 'Example Pairwise LPI Model for conversion to PMTK3 factors.', "
				+" sort(OBJ, Unknown, {a, b}), "
			    +" randomVariable(p, 1, OBJ), "
			    +" randomVariable(q, 1, OBJ), "
			    +" randomVariable(r, 1, OBJ), "
				+" parfactors(" 
				+"  {{ (on X) [if p(X) then (if q(X) then 0.6 else 0.4) else (if q(X) then 0.55 else 0.45)]}}, "
				+"  {{ (on Y) [if p(Y) and q(Y) then 0.2 else 0.8] }}, "
				+"  {{ (on Z) [if q(Z) then 0.1 else 0.9] }}, "
				+"  {{ (on T) [if r(T) then 0.3 else 0.7] }}, "
				+"  { [if r(a) and p(a) then 0.25 else 0.75], [if r(b) then (if p(b) then 0.65 else 0.35) else (if p(b) then 0.64 else 0.36)] }"
				+" )"
				+")");
	}
}
