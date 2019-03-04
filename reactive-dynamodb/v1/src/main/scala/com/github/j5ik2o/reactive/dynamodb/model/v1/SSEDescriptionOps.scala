package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ SSEDescription => JavaSSEDescription }
import com.github.j5ik2o.reactive.dynamodb.model.{ SSEStatus, SSEType, SSEDescription => ScalaSSEDescription }

object SSEDescriptionOps {

  implicit class ScalaSSEDescriptionOps(val self: ScalaSSEDescription) extends AnyVal {

    def toJava: JavaSSEDescription = {
      val result = new JavaSSEDescription()
      self.status.map(_.entryName).foreach(result.setStatus)
      self.sseType.map(_.entryName).foreach(result.setSSEType)
      self.kmsMasterKeyArn.foreach(result.setKMSMasterKeyArn)
      result
    }

  }

  implicit class JavaSSEDescriptionOps(val self: JavaSSEDescription) extends AnyVal {

    def toScala: ScalaSSEDescription = {
      ScalaSSEDescription()
        .withStatus(Option(self.getStatus).map(SSEStatus.withName))
        .withSSEType(Option(self.getSSEType).map(SSEType.withName))
        .withKMSMasterKeyArn(Option(self.getKMSMasterKeyArn))
    }

  }

}
