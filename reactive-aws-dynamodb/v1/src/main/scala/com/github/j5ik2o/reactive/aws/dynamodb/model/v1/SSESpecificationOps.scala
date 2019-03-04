package com.github.j5ik2o.reactive.aws.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ SSESpecification => JavaSSESpecification }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SSEType, SSESpecification => ScalaSSESpecification }
object SSESpecificationOps {

  implicit class ScalaSSESpecificationOps(val self: ScalaSSESpecification) extends AnyVal {

    def toJava: JavaSSESpecification = {
      val result = new JavaSSESpecification()
      self.enabled.foreach(v => result.setEnabled(v))
      self.sseType.map(_.entryName).foreach(result.setSSEType)
      self.kmsMasterKeyId.foreach(result.setKMSMasterKeyId)
      result
    }

  }

  implicit class JavaSSESpecificationOps(val self: JavaSSESpecification) extends AnyVal {

    def toScala: ScalaSSESpecification = {
      ScalaSSESpecification()
        .withEnabled(Option(self.getEnabled)).withSSEType(Option(self.getSSEType).map(SSEType.withName)).withKMSMasterKeyId(
          Option(self.getKMSMasterKeyId)
        )
    }

  }

}
