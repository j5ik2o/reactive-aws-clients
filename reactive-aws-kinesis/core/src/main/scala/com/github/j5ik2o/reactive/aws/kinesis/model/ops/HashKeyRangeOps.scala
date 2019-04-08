// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class HashKeyRangeBuilderOps(val self: HashKeyRange.Builder) extends AnyVal {

  final def startingHashKeyAsScala(value: Option[String]): HashKeyRange.Builder = {
    value.fold(self) { v =>
      self.startingHashKey(v)
    }
  } // String

  final def endingHashKeyAsScala(value: Option[String]): HashKeyRange.Builder = {
    value.fold(self) { v =>
      self.endingHashKey(v)
    }
  } // String

}

final class HashKeyRangeOps(val self: HashKeyRange) extends AnyVal {

  final def startingHashKeyAsScala: Option[String] = Option(self.startingHashKey) // String

  final def endingHashKeyAsScala: Option[String] = Option(self.endingHashKey) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHashKeyRangeOps {

  implicit def toHashKeyRangeBuilderOps(v: HashKeyRange.Builder): HashKeyRangeBuilderOps = new HashKeyRangeBuilderOps(v)

  implicit def toHashKeyRangeOps(v: HashKeyRange): HashKeyRangeOps = new HashKeyRangeOps(v)

}
