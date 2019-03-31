package com.github.j5ik2o.reactive.aws.s3.model

import enumeratum._

import scala.collection.immutable

sealed trait ${simpleTypeName} extends EnumEntry

object ${simpleTypeName} extends Enum[${simpleTypeName}] {
    override def values: immutable.IndexedSeq[${simpleTypeName}] = findValues

<#list entries?keys as key>
<#if !key?starts_with("UNKNOWN_")>
    case object ${key}  extends ${simpleTypeName}
</#if>
</#list>
}