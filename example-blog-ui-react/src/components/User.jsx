import React from 'react'

export default class User extends React.Component {
    render() {
        return (
            <div>
                <h1>{this.props.match.params.user}'s Profile</h1>
            </div>
        )
    }
}