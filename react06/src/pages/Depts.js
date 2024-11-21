import React from 'react'
import { Button, Stack } from 'react-bootstrap'

function Depts() {
  return (
    <>
    <h2>list page</h2>
    <Stack gap={2} className="col-md-10 mx-auto">
        <Button as="a" variant="primary">입력</Button>
    </Stack>
    </>
  )
}

export default Depts